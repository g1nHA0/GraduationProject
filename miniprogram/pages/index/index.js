// 导入request请求工具类 
import {
    requestUtil,
    getBaseUrl
} from '../../utils/requestUtil.js';
import regeneratorRuntime from '../../lib/runtime'
Page({

    /**
     * 页面的初始数据
     */
    data: {
        //轮播图数组
        swiperList: [],
        baseUrl: '',
        bigTypeList:[],
        bigTypeList_row1:[],
        bigTypeList_row2:[],
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        const baseUrl = getBaseUrl();
        this.setData({
            baseUrl
        })
        // //发送异步请求，获取后端参数
        // wx.request({
        //   url: 'http://localhost:8080/product/findSwiper',
        //   method: "GET",
        //   success: (result) => {
        //     console.log(result)
        //     this.setData({
        //       swiperList: result.data.message
        //     })
        //   }
        // })
        this.getSwiperList();
        this.getBigTypeList();
    },
    async getSwiperList() {
        // requestUtil({
        //         url: '/product/findSwiper',
        //         method: "GET"
        //     })
        //     .then(result => {
        //         const baseUrl = getBaseUrl();
        //         this.setData({
        //             swiperList: result.message,
        //             baseUrl
        //         })
        //     })
        const result = await requestUtil({
            url: '/product/findSwiper',
            method: "GET"
        })
        this.setData({
            swiperList: result.message,
        })
    },
    async getBigTypeList(){
        const result = await requestUtil({
            url: '/bigtype/findAll',
            method: "GET"
        })
        const bigTypeList=result.message;
        const bigTypeList_row1=bigTypeList.filter((item,index)=>{
            return index<5;
        })
        const bigTypeList_row2=bigTypeList.filter((item,index)=>{
            return index>=5;
        })
        this.setData({
            bigTypeList,
            bigTypeList_row1,
            bigTypeList_row2,
        })
    },
    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    }
})