const express = require('express');
const multer = require('multer');
const path = require('path'); // Node.js built-in module for handling file paths

const app = express();
const PORT = 3000;

// Set up storage engine
const storage = multer.diskStorage({
    destination: './uploads/', // Destination folder for uploaded files
    filename: function(req, file, cb){
        // Create a custom filename: fieldname-timestamp.ext
        cb(null, file.fieldname + '-' + Date.now() + path.extname(file.originalname));
    }
});

// Initialize upload middleware
const upload = multer({
    storage: storage,
    limits: { fileSize: 1000000 }, // Optional: limit file size to 1MB
    fileFilter: function(req, file, cb){
        // Optional: Filter files by type
        checkFileType(file, cb);
    }
}).single('myFile'); // 'myFile' is the name of the file input field in the HTML form

// Check File Type function (helper for fileFilter)
function checkFileType(file, cb){
    // Allowed extensions
    const filetypes = /jpeg|jpg|png|gif/;
    // Check extension
    const extname = filetypes.test(path.extname(file.originalname).toLowerCase());
    // Check mime type
    const mimetype = filetypes.test(file.mimetype);

    if(mimetype && extname){
        return cb(null,true);
    } else {
        cb('Error: Images Only!');
    }
}

// Create an upload route
app.post('/upload', (req, res) => {
    upload(req, res, (err) => {
        console.log(req.file);
        if(err){
            res.send(err);
        } else {
            if(req.file == undefined){
                res.send('Error: No file selected!');
            } else {
                res.send('File uploaded successfully: ' + req.file.filename);
            }
        }
    });
});

app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
