import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

import login from "@/views/login/login.vue";
import register from "@/views/login/register.vue";

const router = new VueRouter({
  routes: [
    {
      path: "/login",
      component: login,
    },
    {
      path: "/register",
      component: register,
    },
  ],
});

export default router;
