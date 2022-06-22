const express = require('express')
const app = express() 
const path = require('path')
const mailRouter = require('./routers')

app.use(express.json());
app.use('/', mailRouter)

app.set('port', process.env.PORT || 3000) 

app.get('/', (req, res) => {
    res.sendFile (path.join(__dirname, '/index.html'))
})

app.listen(app.get('port'), () => {
    console.log('the Server is ready in port ', app.get('port'))
})