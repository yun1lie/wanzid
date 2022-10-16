<template>
  <div class="ShoppingCart">
    <daohang></daohang>
    <div class="shop">
      <el-table
        ref="multipleTable"
        :data="tableData"
        tooltip-effect="dark"
        style="width: 100%;margin-top: 5%"
      >
        <el-table-column type="selection" width="55"> </el-table-column>
        <!-- <el-table-column  label="Trade name" width="120">
        <template slot-scope="scope">{{ scope.row.date }}</template>
      </el-table-column> -->
        <el-table-column prop="id" label="flower id" width="120">
        </el-table-column
        ><el-table-column prop="fname" label="flower name" width="150">
        </el-table-column
        ><el-table-column prop="price" label="Unit Price" width="120">
        </el-table-column>
        <el-table-column
          prop="fdescribe"
          label="Product description"
          show-overflow-tooltip
        >
        </el-table-column>
      </el-table>
      <div class="total">Total: ${{ this.sum }}</div>
      <div class="but"><el-button icon="el-icon-circle-check" @click="but">Buy</el-button></div>
    </div>
  </div>
</template>

<script>
import daohang from "@/views/login/daohang.vue";
import { getUserCar } from "@/api";
export default {
  components: { daohang },
  created() {
    if (sessionStorage.getItem("userInfo") != null) {
      this.userInfo = JSON.parse(sessionStorage.getItem("userInfo"));
      getUserCar(this.userInfo).then((data) => {
        console.log(data.data);
        this.tableData = data.data;
        for (var i = 0; i < this.tableData.length; i++) {
          this.sum = this.sum + parseInt(this.tableData[i].price);
        }
      });
    }
  },
  methods: {
    but(){
      alert("Purchase Successful");
    }
  },
  data() {
    return {
      sum: 0,
      tableData: [],
      multipleSelection: [],
    };
  },
};
</script>

<style>
.total{
  margin-left: 4%;
  color: red;
}
.but{
  margin-left: 4%;
}
</style>
