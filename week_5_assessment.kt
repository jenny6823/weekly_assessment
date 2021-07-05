fun main() {
    removeVowel("I have a dream that nigeria will be great")
}

fun removeVowel(words: String) {
    for (all in words) {
        if (all == 'a'
            || all == 'A'
            || all == 'e'
            || all == 'E'
            || all == 'i'
            || all == 'I'
            || all == 'o'
            || all == 'O'
            || all == 'u'
            || all == 'U'
        ) {
            continue
        }
        print(all)
    }
}