function arrayDiff (arr1, arr2){
    var newArr = [];

    function inFirst (first, second){

        for (var i = 0; i < first.length; i++){
            if (second.indexOf(first[i]) === -1) {
                newArr.push(first[i]);

            }
     }
    }
    inFirst(arr1, arr2);
    inFirst(arr2, arr1);

    return newArr;
}
console.log(arrayDiff(['mum', 'dad', 'child'],['mum', 'dad', 'child', 'me']));