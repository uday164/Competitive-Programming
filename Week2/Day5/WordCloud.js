function WordCloudData(inputString) {
  this.wordToCounts = new Map();
  this.populateWordsToCounts(inputString);
}

WordCloudData.prototype.populateWordsToCounts = function(inputString) {
  var currentWord = '';

  for (var i = 0; i < inputString.length; i++) {
    var character = inputString.charAt(i);
    if (i === inputString.length - 1) {
      if (this.isLetter(character)) currentWord += character;
      if (currentWord.length) this.addWordToMap(currentWord);

    } else if (character === ' ' || character === '\u2014') {
      if (currentWord.length) this.addWordToMap(currentWord);
      currentWord = '';
      
    } else if (character === '.') {
      if (i < inputString.length - 1 && inputString.charAt(i + 1) === '.') {
        if (currentWord.length) this.addWordToMap(currentWord);
        currentWord = '';
      }

    } else if (this.isLetter(character) || character === '\'') {
      currentWord += character;

    } else if (character === '-') {
      if (i > 0 && this.isLetter(inputString.charAt(i - 1)) &&
        this.isLetter(inputString.charAt(i + 1))) {
        currentWord += character
      }
    }
  }
};

WordCloudData.prototype.addWordToMap = function(word) {
  var newCount;

  
  if (this.wordToCounts.has(word)) {
    newCount = this.wordToCounts.get(word) + 1;
    this.wordToCounts.set(word, newCount);

 
  } else if (this.wordToCounts.has(word.toLowerCase())) {
    newCount = this.wordToCounts.get(word.toLowerCase()) + 1;
    this.wordToCounts.set(word.toLowerCase(), newCount);


  } else (this.wordToCounts.has(this.capitalize(word))) {
    newCount = this.wordToCounts.get(this.capitalize(word)) + 1;
    this.wordToCounts.set(word, newCount);
    this.wordToCounts.delete(this.capitalize(word));

    //otherwise the word is not in the map at all,
    // lowercase or uppercase so we add it to the map
  } else {
    this.wordToCounts.set(word, 1);
  }
};

WordCloudData.prototype.capitalize = function(word) {
  return word.charAt(0).toUpperCase() + word.slice(1);
}

WordCloudData.prototype.isLetter = function(character) {
  return 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'.indexOf(character) >= 0;
}

