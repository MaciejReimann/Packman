const express = require('express');
const router = express.Router();

router.get('/', (req, res) => {
    // res.set('Content-Type', 'application/json');
    res.send({payload:"Hello from the custom API route!"});
});

module.exports = router;