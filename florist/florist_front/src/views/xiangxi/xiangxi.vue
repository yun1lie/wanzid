<template>
    <div>
        <daohang></daohang>
        <div>
            <img :src="flowerviewInfo.picture_url" alt="" />
        </div>
       
    </div>
</template>

<script>
import daohang from "@/views/login/daohang.vue";
import { getFlowerview } from "@/api";
export default {
    data() {
    return {

      flowerviewInfo: {
        picture_url:"http://127.0.0.1:5000/static/img/1.jpg"
      },
    };
  },
  created() {
    getFlowerview().then((data) => {
      console.log(data.data);
      this.flowerviewInfo = data.data;
    });
  },
    components: { daohang },
};
</script>

<style>
.img {
    width: 50px;
    height: 100px;
}
</style>