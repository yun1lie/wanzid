<template>
  <div class="TheNav">
    <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
    >
      <el-menu-item index="1" style="margin-left: 5%">
        <router-link to="/">首页</router-link>
      </el-menu-item>
      <el-menu-item index="2" style="margin-left: 70%">
        <router-link to="/ShoppingCart">Shopping Cart</router-link>

        <!-- <a href="https://www.ele.me" target="_blank"></a> -->
      </el-menu-item>
      <el-menu-item v-if="userInfo == ''" index="3"
        ><router-link to="login">您好，请先登录</router-link></el-menu-item
      >
      <el-menu-item v-if="userInfo != ''" index="3"
        ><router-link to="#">{{ userInfo.username }}</router-link></el-menu-item
      >

      <el-menu-item index="4" v-if="userInfo == ''" style="margin-left: -10px"
        ><router-link to="register">注册</router-link></el-menu-item
      >
    </el-menu>
    <div class="line"></div>
  </div>
</template>

<script>
export default {
  created() {
    if (sessionStorage.getItem("userInfo") != null) {
      console.log("userInfo insted");
      this.userInfo = JSON.parse(sessionStorage.getItem("userInfo"));
    }
  },
  data() {
    return {
      activeIndex: "1",
      activeIndex2: "1",
      userInfo: "",
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
  },
};
</script>

<style>
.a1 {
  color: black;
}
.a1:hover {
  color: orange;
}
</style>
