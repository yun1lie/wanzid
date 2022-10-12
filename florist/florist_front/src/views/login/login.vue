<template>
 <div>
  <daohang></daohang>
  <div class="login">
    <div class="longpic">
      <div class="loginform">
        <el-form ref="form" :rules="rules" :model="form" label-width="80px">
          <el-form-item label="username:" prop="username">
            <el-input
              v-model="form.username"
              placeholder="Please enter user name"
            ></el-input>
          </el-form-item>
          <el-form-item label="password:" prop="userpwd">
            <el-input
              v-model="form.userpwd"
              placeholder="Please input password"
            ></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit('form')"
              >login</el-button
            >
            <a href="">Registered account</a>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
 </div>
</template>

<script>
import daohang from './daohang.vue';
export default {
  components: { daohang },
  data() {
    return {
      form: {
        username: "",
        userpwd: "",
      },
      rules: {
        username: [
          { required: true, message: "enter one user name", trigger: "blur" },
        ],
        userpwd: [
          {
            required: true,
            message: "enter one user password",
            trigger: "blur",
          },
        ],
      },
    };
  },

  methods: {
    onSubmit(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert("submit!");
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
  },
};
</script>

<style>
.longpic {
  background-image: url("flowerpic.jpeg");
  height: 300px;
}
.loginform {
  padding: 20px;
  background-color: aliceblue;
  position: relative;
  top: 50px;
  margin-left: 70%;
  width: 20%;
  height: 200px;
  margin-top: 100px;
}
</style>