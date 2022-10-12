<template>
  <div class="home">
    <daohang></daohang>
    <h1>home</h1>
    <div class="Riding-lantern">
      <!-- 轮播图 -->
      <div class="block">
        <span class="demonstration">默认 Hover 指示器触发</span>
        <el-carousel height="480px">
          <el-carousel-item v-for="(list, index) in dataList" :key="index">
            {{ list.title }}
            {{list}}
            <img :src="list.img" >
            <img
              v-for="(imgList, index2) in list"
              :key="index2"
              class="top-img"
              :src="imgList.img"
              :alt="imgList.title"
            />
          </el-carousel-item>
        </el-carousel>
      </div>
    </div>
  </div>
</template>

<script>
import daohang from "@/views/login/daohang.vue";
export default {
  data() {
    return {
      dataList: [
        {
          title: "111",
          url: "xxx",
          img: "@/assets/logo.png",
        },
        {
          title: "22",
          url: "xxx",
          img: "./pic/pic2.jpeg",
        },
        {
          title: "33",
          url: "xxx",
          img: "./pic/pic3.jpeg",
        },
        {
          title: "111",
          url: "xxx",
          img: "./pic/pic4.jpeg",
        },
      ],
    };
  },
  components: { daohang },
};
</script>

<style>
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
}

/* .el-carousel__item:nth-child(n) {
  background-image: url("./pic/pic1.jpeg");
}

.el-carousel__item:nth-child(n) {
  background-image: url("./pic/pic1.jpeg");
} */
</style>