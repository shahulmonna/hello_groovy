 boolValue = true
notEmptyStr =new String("d");
numberList = ["1","2", "3"]

if (boolValue && notEmptyStr && numberList) {
    println "Condition is true"
}else{
    println "Condition is false"
}

boolValue = false
emptyStr = new String("");
emptyList = []

if( boolValue || emptyStr || emptyList){
    println "Condition is true"
}else{
    println "Condition is false"
}
