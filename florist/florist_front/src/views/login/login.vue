<template>
  <div class="login">
    <div class="longpic">
      <div class="loginform">
        <el-form ref="form" :model="form" label-width="80px">
          <el-form-item label="username:">
            <el-input
              v-model="form.username"
              placeholder="Please enter user name"
            ></el-input>
          </el-form-item>
          <el-form-item label="password:">
            <el-input
              v-model="form.userpwd"
              placeholder="Please input password"
            ></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">login</el-button>
            <a href="">Registered account</a>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        username: "",
        userpwd: "",
      },
    };
  },
  methods: {
    onSubmit() {
      console.log("submit!");
    },
  },
};
</script>

<style>
.longpic {
  background-image: url("flowerpic.jpeg");
}
.loginform {
  position: relative;
  top: 50px;
  margin-left: 70%;
  width: 20%;
  height: 300px;
  margin-top: 100px;
}
</style>