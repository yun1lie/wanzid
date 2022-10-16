<template>
  <div class="TheNav">
    <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
    >
      <el-menu-item index="1" style="margin-left: 5%">
        <router-link to="/">HomePage</router-link>
      </el-menu-item>
      <!-- <el-menu-item style="margin-left: 55%" index="2"
        ><a href="https://www.ele.me" target="_blank">订单查询</a></el-menu-item
      > -->
      <!-- <el-submenu index="3" style="float:right">
        <template slot="title">客户服务</template>
        <el-menu-item index="3-1"
          ><a class="a1" href="https://www.ele.me" target="_blank"
            >在线支付</a
          ></el-menu-item
        >
        <el-menu-item index="3-2"
          ><a class="a1" href="https://www.ele.me" target="_blank"
            >售后服务</a
          ></el-menu-item
        >
        <el-menu-item index="3-3"
          ><a class="a1" href="https://www.ele.me" target="_blank"
            >留言反馈</a
          ></el-menu-item
        >
      </el-submenu> -->
      <el-menu-item index="4" v-if="userInfo != ''" style="float:right">
        <router-link to="/ShoppingCart">Shopping Cart</router-link>

        <!-- <a href="https://www.ele.me" target="_blank"></a> -->
      </el-menu-item>
      <el-menu-item v-if="userInfo == ''" index="5" style="float:right"
        ><router-link to="login">please login</router-link></el-menu-item
      >
      <el-menu-item v-if="userInfo != ''" index="5" style="float:right"
        ><router-link to="#">{{ userInfo.username }}</router-link></el-menu-item
      >

      <el-menu-item index="6" v-if="userInfo == ''" style="float:right"
        ><router-link to="register">register</router-link></el-menu-item
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
