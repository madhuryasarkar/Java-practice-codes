//Linear Search.

function linearSearch(srch){
  
  var arr = [5, 10, 15, 16, 58, 23, 78, 26, 74];
  for(var i=0;i<arr.length;i++){
    if(srch == arr[i]){
      console.log("Element is persent: "+srch);
      return true;
    } 
  } 
  console.log("Element not found");
  return false;
}

linearSearch(3);
