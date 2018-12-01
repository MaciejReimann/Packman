const express = require('express');
const mongoose = require('mongoose');
const path = require('path');
// Take requests and data from the body
const bodyParser = require('body-parser');
// Import router
const items = require('./routes/api/items');
const custom = require('./routes/api/custom');
const PORT = process.env.PORT || 5000;

// Initialize express into app
const app = express();

// Apply Bodyparser Middleware
// Parse incoming request bodies in a middleware before your handlers, 
// available under the req.body property.
// https://www.npmjs.com/package/body-parser
// app.use(bodyParser.json());

// // DB Config
// const db = require('./config/keys').mongoURI;

// // Connect to Mongo
// if (db) {
//     mongoose
//     .connect(db)
//         .then(() => console.log('MongoDB connected'))
//         .catch(err => console.log(err))
// } else {
//     console.error("MONGOOSE ERROR: Probably some problem with Mongo keys")
// }

// Use Routes
app.use('/api/items', items);
app.use('/api/custom', custom);


// Set static folder
app.use(express.static(path.resolve(__dirname, '../client/build')));

app.get("*", (req, res) => {
    res.sendFile(path.resolve(__dirname, '../client/build', 'index.html'));
});


app.listen(PORT, () => console.log(`Server started on ${PORT}`));
