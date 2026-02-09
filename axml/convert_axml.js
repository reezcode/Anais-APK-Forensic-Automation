#!/usr/bin/env node

const fs = require('fs');
const path = require('path');
const { Axml2xml } = require('./index');

// Read input and output paths from command line arguments
const inputFile = process.argv[2];
const outputFile = process.argv[3] || inputFile.replace(/\.axml$/, '.xml');

if (!inputFile) {
    console.error('Usage: node convert_axml.js <input.axml> [output.xml]');
    process.exit(1);
}

if (!fs.existsSync(inputFile)) {
    console.error(`Error: File not found: ${inputFile}`);
    process.exit(1);
}

try {
    const buf = fs.readFileSync(inputFile);
    const xmlString = Axml2xml.convert(buf);

    fs.writeFileSync(outputFile, xmlString, 'utf8');
    console.log(`Successfully converted ${inputFile} to ${outputFile}`);
    process.exit(0);
} catch (error) {
    console.error(`Error converting file: ${error.message}`);
    process.exit(1);
}
