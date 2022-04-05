const express = require('express')
const app = express()
const port = 3001

app.use((req, res, next) => {
    res.header('Access-Control-Allow-Origin', '*');
    next();
  });

app.get('/', (req, res) => {
    console.log("/ called")
    res.send("")
})

app.get('/kirti', (req, res) => {
    console.log("/kirti called")
    res.send('Hello Kirti!')
})

app.get('/pratik', (req, res) => {
    console.log("/pratik called")
    res.send('Hello Pratik!')
})


app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})