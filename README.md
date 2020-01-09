# Tic_Tac_Toe
A simple Tic Tac Toe game make by using javafx scene builder. 
## Getting Started
These instruction will get you a copy of the project up and running on your local machine for development and testing purpose. See deployment for notes on how to deploy the project on live stream.
### Prerequisites
`javafx-sdk-13.0.1`
`javafx scene builder`
`IntelliJ IDEA`
### Installing 
1. Clone or download zip from github
1. Extract the zip file (Only for those who downloaded the zip file instead of cloning)
1. Open the project in IntelliJ IDEA.
1. Once the project has opened in Intellij IDEA, go to `File -> Settings -> Appereance and behaviour -> Path Variable` add the library of _javafx-sdk-13.0.1_ 
1. Name the variables `PATH_TO_FX` and the value is the path where you stored your javafx-sdk. Click `Apply` after it has successfully added. 
1. Go to `<Run -> Edit Configurations -> Application -> Main>` 
1. At the `<VM options>`, added this line `--module-path ${PATH_TO_FX} --add-modules javafx.controls,javafx.fxml` and click `Apply`
1. Go to `File -> Project Structure -> Project Settings -> Libraries`, in the libraries, add a New Project Library of Java then choose the `lib` file of you __javafx-sdk-13.0.1__ and click `APPLY`.
### Built with 
- [javafx scene builder](https://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-info-2157684.html) - A scene builder for the GUI 
- [javafx-sdk-13.0.1](https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html) - Java SE Development Kit 13
# Author
- Dixon Chu - initial work - [Dixon Chu](https://github.com/DixonChu) 
