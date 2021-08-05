function spinal(str){
    return str.split(/\s|_|(?=[A-Z])/).join("-").toLowerCase();
}

console.log(spinal("The spinal effect"))