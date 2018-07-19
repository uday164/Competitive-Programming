const fs = require('fs')

function findDuplicateFiles(startingDirectory) {
  var filesSeenAlready = {};
  var stack = [startingDirectory];

  var duplicates = [];

  while (stack.length) {
    var currentPath = stack.pop();
    var currentFile = fs.statSync(currentPath);

    if (currentFile.isDirectory()) {
      fs.readdirSync(currentPath).forEach((path) => {
        stack.push(currentPath + '/' + path);
      });
      
    } else {
      
      var fileContents = fs.readFileSync(currentPath);
      
      var currentLastEditedTime = currentFile.mtime;

      
      if(filesSeenAlready.hasOwnProperty(fileContents)){
        var existingFile = filesSeenAlready[fileContents];
        if (currentLastEditedTime > existingFile.lastEditedTime) {
          
          duplicates.push([currentPath, existingFile.path]);
        } else {
          
          duplicates.push([existingFile.path, currentPath]);
          
          filesSeenAlready[fileContents] = {lastEditedTime: currentLastEditedTime, path: currentPath}
        }
      } else {
        filesSeenAlready[fileContents] = {lastEditedTime: currentLastEditedTime, path: currentPath}
      }
    }
  }
  return duplicates;
}
