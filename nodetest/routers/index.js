const express = require('express');
const nodemailer = require('nodemailer');
const router = express.Router();

router.post("/nodemailerTest", async (req, res, next) => {
try{
    let email = req.body.email;
    console.log(email)

    let transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
        user: 'springfeed2022@gmail.com',  // gmail 계정 아이디를 입력
        pass: 'Springfeed2022!'          // gmail 계정의 비밀번호를 입력
        }
    });

    let mailOptions = {
        from: 'springfeed2022@gmail.com',    // 발송 메일 주소 (위에서 작성한 gmail 계정 아이디)
        to: email,                     // 수신 메일 주소
        subject: 'springfeed 임시 비밀번호 안내입니다.',   // 제목
        text: '고객님의 임시 비밀번호는 SNDIFKR2L3DN입니다. 로그인 후 비밀번호를 변경해 주세요:)'  // 내용
    };

    transporter.sendMail(mailOptions, function(error, info){
        if (error) {
            console.log(error);
        }
        else {
            console.log('Email sent: ' + info.response);
        }
    });

    res.redirect("/");
    } catch (err) {
        console.error(err);
    }
})

module.exports = router;