 // A String is nothing but a sequence of characters.
def hello = "Hello"
for(aChar in hello){
    println aChar
}

// A Collection object holding the four seasons.
def seasons = ["Winter", "Season", "Spring", "Autumn"]
for(season in seasons){
    println season
}

// Even a File Object can be iterated in Groovy.
//Reading Files Line by Line
String thisFileName = "Loop.groovy"
thisFile = new File(thisFileName)
thisFile.eachLine(){
    println it
}
