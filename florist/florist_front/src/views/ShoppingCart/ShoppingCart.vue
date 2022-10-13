<template>
  <div class="ShoppingCart">
    <daohang></daohang>
    <el-table
      ref="multipleTable"
      :data="tableData"
      tooltip-effect="dark"
      style="width: 100%"

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
      <!-- <el-table-column label="operation">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)"
            >删除</el-button
          >
        </template>
      </el-table-column> -->
    </el-table>
    <div>合计{{ this.sum }} 元</div>
    <el-button>结算</el-button>
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
</style>