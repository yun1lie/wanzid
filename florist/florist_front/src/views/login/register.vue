<template>
  <div class="register">
    <div class="registerpic">
      <div class="regform">
        <h3>register</h3>
        <el-form ref="form" :model="form" label-width="150px" :rules="rules">
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
              type="password"
            ></el-input>
          </el-form-item>
          <el-form-item label="Confirm Password:" prop="reuserpwd">
            <el-input
              v-model="form.reuserpwd"
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
</template>

<script>
export default {
  data() {
    return {
      form: {
        username: "",
        userpwd: "",
        reuserpwd: "",
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
          {
            min: 6,
            message: "The length is not less than 6 characters",
            trigger: "blur",
          },
        ],
        reuserpwd: [
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
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid && this.form.userpwd == this.form.reuserpwd) {
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