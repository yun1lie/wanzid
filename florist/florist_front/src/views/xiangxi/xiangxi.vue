<template>
  <div>
    <daohang></daohang>
    <div class="xiangxi1">
      <div class="left">
        <img class="leftimg" :src="this.picUrl" alt="" />
      </div>
      <div class="right">
        <div class="xiangxi2">
          <h1 style="color: pink">Name:{{ this.fname }}</h1>
          <br />
          <h2 style="margin-left: 15%; font-size: 30px; color: red">
            Price:${{ this.price }}
          </h2>
        </div>
        <div class="xiangxi3">
          <span style="font-size: 20px; float: left; color: orange"
            >Language of Flower :</span
          >
          <span style="font-size: 20px; float: left; color: yellowgreen">{{
            this.fdescribe
          }}</span>
        </div>
        <div class="goumaianniu">
          <el-button type="primary" icon="el-icon-goods" @click="addCart"
            >add to cart</el-button
          >
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import daohang from "@/views/login/daohang.vue";
import { addCart } from "@/api";
export default {
  data() {
    return {
      flowerviewInfo: {},
    };
  },
  methods: {
    addCart() {
      console.log("addCart");
      var userId = JSON.parse(sessionStorage.getItem("userInfo")).id;
      console.log(userId);
      var flowerId = this.id;
      var cartInfo = {
        userId: userId,
        flowerId: flowerId,
      };
      console.log(cartInfo);
      addCart(cartInfo).then((data) => {
        console.log(data.data);
        if(data.data == 1){
          alert("add successful");
        }else{
          alert("Already in the shopping cart");
        }
      });
    },
  },
  created() {
    this.id = this.$route.query.id;
    this.picUrl = this.$route.query.picUrl;
    this.fname = this.$route.query.fname;
    this.price = this.$route.query.price;
    this.fdescribe = this.$route.query.fdescribe;
  },
  components: { daohang },
};
</script>

<style>
.xiangxi1 {
  margin-top: 5%;
  float: left;
  width: 100%;
}
.left {
  width: 50%;
  float: left;
}
.right {
  margin-top: 3%;
  width: 45%;
  height: 500px;
  float: left;
  background-color: #f3f5f7;
}
.xiangxi2 {
  width: 60%;
  margin: 0 25%;
}
.xiangxi3 {
  margin-left: 10%;
  margin-top: 15%;
}
.leftimg {
  margin-left: 15%;
  width: 500px;
}
.goumaianniu {
  margin-left: 37%;
  margin-top: 30%;
}
</style>
