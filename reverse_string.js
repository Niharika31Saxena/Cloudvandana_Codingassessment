function reverseWordsInSentence(sentence) {
    const words = sentence.split(' '); 
    const reversedWords = [];

    for (const word of words) {
        const reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }

    return reversedWords.join(' ');
}

function reverseWord(word) {
    const wordChars = word.split(''); 
    let start = 0;
    let end = wordChars.length - 1;

    while (start < end) {
        // Swap characters from both ends
        const temp = wordChars[start];
        wordChars[start] = wordChars[end];
        wordChars[end] = temp;
        start++;
        end--;
    }

    return wordChars.join(''); 
}

const sentence = 'This is a sunny day';
const reversedSentence = reverseWordsInSentence(sentence);
console.log(reversedSentence); 
