<template>
  <div class="ShoppingCart">
    <daohang></daohang>
    <el-table
      ref="multipleTable"
      :data="tableData"
      tooltip-effect="dark"
      style="width: 100%"
      @selection-change="handleSelectionChange"
    >
      <el-table-column type="selection" width="55"> </el-table-column>
      <el-table-column label="Trade name" width="120">
        <template slot-scope="scope">{{ scope.row.date }}</template>
      </el-table-column>
      <el-table-column prop="name" label="Unit Price" width="120">
      </el-table-column>
      <el-table-column
        prop="address"
        label="Product description"
        show-overflow-tooltip
      >
      </el-table-column>
      <el-table-column label="operation">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)"
            >删除</el-button
          >
        </template>
      </el-table-column>
    </el-table>
    <div>合计 XX 元</div>
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
      });
    }
  },
  data() {
    return {
      tableData: [
        {
          date: "2016-05-03",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-02",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-04",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-01",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-08",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-06",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-07",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
      ],
      multipleSelection: [],
    };
  },
};
</script>

<style>
</style>