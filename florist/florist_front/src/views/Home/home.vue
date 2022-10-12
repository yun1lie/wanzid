<template>
  <div class="home">
    <daohang></daohang>
    <div class="tittle">
      <div class="tt"><router-link to="#">flower</router-link></div>
      <div class="tt"><router-link to="#">Immortal flower</router-link></div>
      <div class="tt"><router-link to="#">Cake</router-link></div>
      <div class="tt">
        <router-link to="#"
          >A Complete Collection of Flower Language</router-link
        >
      </div>
    </div>
    <div class="Riding-lantern">
      <!-- 轮播图 -->
      <div class="block">
        <el-carousel height="480px">
          <el-carousel-item v-for="item in 3" :key="item">
            {{ item }}
          </el-carousel-item>
        </el-carousel>
      </div>
    </div>

    <div class="card-list">
      <!-- 商品显示 -->
      <div class="card">
        <img src="./pic/flower1.jpg" alt="" />
        <p>qian</p>
      </div>
      <div class="card"><img src="./pic/flower2.jpg" alt="" /></div>
      <div class="card"><img src="./pic/flower3.jpg" alt="" /></div>
      <div class="card"><img src="./pic/flower4.jpg" alt="" /></div>
    </div>
  </div>
</template>

<script>
import daohang from "@/views/login/daohang.vue";
export default {
  data() {
    return {};
  },
  components: { daohang },
};
</script>

<style>
.home .card-list {
  margin: auto;
  display: flex;
  width: 80%;
}
.home .card-list .card img {
  height: 240px;
}
.home .card-list .card {
  width: 20%;
  height: 380px;
  margin-left: 5%;
}
.home .tittle {
  margin-left: 20%;
  display: flex;
}
.home .tittle .tt {
  margin-left: 50px;
  margin: 0 14px;
  font-size: 18px;
  font-weight: bold;
  line-height: 52px;
  display: inline-block;
}
.home .el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
}

.home .el-carousel__item:nth-child(n) {
  background-image: url("./pic/pic1.jpeg");
}

.home .el-carousel__item:nth-child(2n) {
  background-image: url("./pic/pic2.jpeg");
}
.home .el-carousel__item:nth-child(3n) {
  background-image: url("./pic/pic4.jpeg");
}
</style>