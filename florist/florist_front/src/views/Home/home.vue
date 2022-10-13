<template>
  <div class="home">
    <daohang></daohang>
    <!-- <div class="tittle">
      <div class="tt"><router-link to="#">flower</router-link></div>
      <div class="tt"><router-link to="#">Immortal flower</router-link></div>
      <div class="tt"><router-link to="#">Cake</router-link></div>
      <div class="tt">
        <router-link to="#"
          >A Complete Collection of Flower Language</router-link
        >
      </div>
    </div> -->
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
          <router-link class="a1" to="#">Love with Flower</router-link>
          <span>Give to the people you care about</span>
          
        </h3>
      </div>
      <div class="card">
        <div class="card1">
          <img class="pic" src="./pic/home_floor_lover.png" alt="" />
          <div class="jianshi">
            <div class="grid-container">
              <div v-for="i in this.flowerInfo" :key="i.id">
                <div class="bj">
                  <img class="img1" :src="i.picUrl" alt="" />
                  <div class="miaoshu">
                    {{ i.fname }}
                    <div
                      class="miaoshu"
                      style="margin-top: 5%; font-size: 25px"
                    >
                      {{ i.price }}
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import daohang from "@/views/login/daohang.vue";
import { getFlower } from "@/api";
export default {
  data() {
    return {
      flowerInfo: [],
    };
  },
  created() {
    getFlower().then((data) => {
      console.log(data.data);
      this.flowerInfo = data.data;
    });
  },
  components: { daohang },
};
</script>

<style>
.home .all {
  width: 80%;
  margin: auto;
  height: 300px;
  border: 1px red solid;
  display: flex;
}

.home .all .left {
  width: 20%;
  height: 300px;
  border: 1px red solid;
}
.home .all .right {
  width: 80%;
  height: 300px;
  border: 1px blue solid;
}
.wz {
  float: left;
  width: 100%;
  height: auto;
  margin-top: 5%;
  background-color: #f7f9fa;
}

.wz .a1 {
  margin-left: 5%;
  font-size: 25px;
}

.wz span {
  padding-left: 15px;
  margin-left: 16px;
  font-size: 20px;
  line-height: 24px;
  font-weight: normal;
  border-left: 1px solid #71797f;
}
.card {
  width: 100%;
  height: 1000px;
  background-color: #f7f9fa;
  margin-bottom: 5%;
}

.pic {
  display: inline-block;
  margin-left: 10%;
}

.jianshi {
  width: 70%;
  display: inline-block;
}
.grid-container {
  /* display: inline-block; */
  width: 1200px;
}
.img1 {
  margin-left: 10%;
  width: 80%;
  height: 225px;
}

.bj {
  float: left;
  margin-left: 4%;
  background-color: white;
  height: 300px;
  width: 17%;
  margin-top: 2%;
}
.bj :hover {
  color: orange;
}
.miaoshu {
  text-align: center;
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
  background-size: cover;
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