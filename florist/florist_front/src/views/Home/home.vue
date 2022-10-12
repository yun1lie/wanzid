<template>
  <div class="home">
    <daohang></daohang>
    <div class="tittle">
      <div class="tt"><router-link to="#">flower</router-link></div>
      <div class="tt"><router-link to="#">Immortal flower</router-link></div>
      <div class="tt"><router-link to="#">Cake</router-link></div>
      <div class="tt">
        <router-link to="#">A Complete Collection of Flower Language</router-link>
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
    <div class="crad-list">
      <div class="wz">
        <h3>
          <a class="a1" href="">爱情鲜花</a>
        <span>送 · 让你怦然心动的人</span>
        <router-link class="router1" to="#">更多</router-link>
        </h3>
        
      </div>
     <div class="card">
      <div class="card1">
          <div class="pic">
              <img src="./pic/home_floor_lover.png" alt="">
          </div>
          <div>

          </div>
      </div>
     </div>
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
.wz{
  float: left;
  width: 100%;
  height: auto;
  margin-top:5%;
  background-color:#F7F9FA;
}
.wz .router1{
  margin-left: 45%;
  font-size:18px;
}
.wz .router1:hover{
  color:orange;
}
.wz .a1{
  margin-left: 20%;
  font-size: 25px;
}

.wz span{
  padding-left: 15px;
    margin-left: 16px;
    font-size: 20px;
    line-height: 24px;
    font-weight: normal;
    border-left: 1px solid #71797F;
}
.card{
  height: 1000px;
  background-color:#F7F9FA;
  margin-bottom: 5%;
}
.pic{
  margin-left: 20%;
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
  background-image: url("./pic/pic1.jpg");
  background-size:cover;
  background-repeat: no-repeat;
}

.home .el-carousel__item:nth-child(2n) {
  background-image: url("./pic/pic2.jpg");
  background-repeat: no-repeat;
}
.home .el-carousel__item:nth-child(3n) {
  background-image: url("./pic/pic3.jpg");
  background-repeat: no-repeat;
}
</style>