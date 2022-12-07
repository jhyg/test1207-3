
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AManager from "./components/listers/ACards"
import ADetail from "./components/listers/ADetail"

import A23Manager from "./components/listers/A23Cards"
import A23Detail from "./components/listers/A23Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/as',
                name: 'AManager',
                component: AManager
            },
            {
                path: '/as/:id',
                name: 'ADetail',
                component: ADetail
            },

            {
                path: '/a23s',
                name: 'A23Manager',
                component: A23Manager
            },
            {
                path: '/a23s/:id',
                name: 'A23Detail',
                component: A23Detail
            },



    ]
})
