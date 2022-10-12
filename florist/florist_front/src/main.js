import Vue from "vue";
import router from "@/router";
// 引入elementui
import ElementUI from "element-ui";
import "element-ui/lib/theme-chalk/index.css";
import App from "./App.vue";

Vue.use(ElementUI);

Vue.config.productionTip = false;

new Vue({
  render: (h) => h(App),
  // 注册路由
  router,
}).$mount("#app");
