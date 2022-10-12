import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

import login from "@/views/login/login.vue";

const router = new VueRouter({
  routes: [
    {
      path: "/login",
      component: login,
    },
  ],
});

export default router;
