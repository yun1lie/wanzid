<template>
  <div>
    <daohang></daohang>
    <div class="register">
      <div class="registerpic">
        <div class="regform">
          <h3>register</h3>
          <el-form ref="form" :model="form" label-width="150px" :rules="rules">
            <el-form-item label="name:" prop="name">
              <el-input
                v-model="form.name"
                placeholder="Please enter user name"
              ></el-input>
            </el-form-item>
            <el-form-item label="password:" prop="password">
              <el-input
                v-model="form.password"
                placeholder="Please input password"
                type="password"
              ></el-input>
            </el-form-item>
            <el-form-item label="Confirm Password:" prop="repassword">
              <el-input
                v-model="form.repassword"
                placeholder="Please Confirm Password"
                type="password"
              ></el-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="submitForm('form')"
                >register</el-button
              >
            </el-form-item>
          </el-form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import daohang from "./daohang.vue";
import { request } from "@/api";
// import { Login } from "@/api";
export default {
  components: { daohang },

  data() {
    return {
      form: {
        username: "",
        password: "",
        repassword: "",
      },
      rules: {
        name: [
          { required: true, message: "enter one user name", trigger: "blur" },
        ],
        password: [
          {
            required: true,
            message: "enter one user password",
            trigger: "blur",
          },
          {
            min: 6,
            message: "The length is not less than 6 characters",
            trigger: "blur",
          },
        ],
        repassword: [
          {
            required: true,
            message: "enter one user password",
            trigger: "blur",
          },
          {
            min: 6,
            message: "The length is not less than 6 characters",
            trigger: "blur",
          },
        ],
      },
    };
  },
  // methods: {
  //   log() {
  //     console.log(this.user);
  //     Login(this.user).then((data) => {
  //       console.log(data.data);
  //       // 把登录信息存入session
  //       sessionStorage.setItem("token", JSON.stringify(data.data));
  //       if (data.data.state == "200") {
  //         // 登录成功
  //         this.$router.push("/UserHome");
  //       } else {
  //         alert("登录失败,请检查用户名和密码是否正确");
  //       }
  //     });
  //   },
  // },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid && this.form.password == this.form.repassword) {
          alert("submit!");
          var userInfo = {
            username: this.form.name,
            password: this.form.password,
          };
          // var userInfo = JSON.stringify(userInfo);
          console.log(userInfo);

          request(userInfo).then((data) => {
            console.log(data);
          });
        } else {
          alert("The user name and password entered twice are inconsistent");
          console.log("error submit!!");
          return false;
        }
      });
    },
  },
};
</script>

<style>
.registerpic {
  background-image: url("flowerpic.jpeg");
  height: 470px;
}
.regform {
  padding: 20px;
  background-color: rgb(242 242 242 / 70%);
  position: relative;
  top: 50px;
  margin-left: 65%;
  width: 25%;
  height: 310px;
  margin-top: 100px;
}
</style>
