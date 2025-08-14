/**
 * @param {number} n
 * @return {Function} counter
 */
let x;
let c=0;
var createCounter = function(n) {
    if(n!=x){
        x=n;
        c=0;
    }
    return function() {
        return x+c++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */