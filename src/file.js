Array.prototype.method1 = function () {
    var arr[];
    for(var i=0;i<this.length;i++){
        if(arr.indexOf(this[i])==-1){
            arr.push(this[i]);
        }
    }
    return arr;

}