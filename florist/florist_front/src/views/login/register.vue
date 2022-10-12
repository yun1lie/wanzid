<template>
  <div class="register">
    <div class="registerpic">
      <div class="regform">
        <el-form ref="form" :model="form" label-width="80px" :rules="rules">
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
              >login</el-button
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
.longpic {
  background-image: url("flowerpic.jpeg");
}
.regform {
  position: relative;
  top: 50px;
  margin-left: 70%;
  width: 20%;
  height: 300px;
  margin-top: 100px;
}
</style>