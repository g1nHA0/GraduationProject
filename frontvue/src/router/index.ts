import {createRouter, createWebHistory, createWebHashHistory, createMemoryHistory, RouteRecordRaw} from 'vue-router'

const routes: Array<RouteRecordRaw> = [{
    path: '/',
    component: () => import('../components/Discover.vue')
},
    {
    path: '/login',
    component: () => import('../views/login/index.vue')
    }]


const router = createRouter({
    history: createWebHistory(),
    routes
})

//导出router
export default router