
let pluvalue = 0; //value of plu (currently hardcoding and guesstimating)

const csv = require('csv-parser');   //initalizes parsing and file opening
const fs = require('fs');

fs.createReadStream('plu_codes.csv')  //opens stream
  .pipe(csv())
  .on('data', (row) => {                //gets row and then prints it if it matchs if statement
    
    pluvalue++;

    if(pluvalue == 483){        //HARDCODED to show 483th item, ideally we'd have all plu to avoid this
    console.log(row);           //PLU# 4020 for Large Golden Delicious
    }
  })
  .on('end', () => {                    //success if goes through whole program
    console.log('CSV file successfully processed');
  });
