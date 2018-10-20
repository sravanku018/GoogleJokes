package com.example.subramanyam.jokes1;



import java.util.Random;

public class JLibrary {
    private static final String[] JOKES = {
            "Did you hear about the crook who stole a calendar? He got twelve months.",
            "Q. What’s the difference between ignorance and apathy? A. I don’t know and I don’t care.",
            "Did you hear about the semi-colon that broke the law? He was given two consecutive sentences.",
            "The world tongue-twister champion just got arrested. I hear they’re gonna give him a really tough sentence.",
            "I own the world’s worst thesaurus. Not only is it awful, it’s awful.",
            "Correct punctuation: the difference between a sentence that’s well-written and a sentence that’s, well, written.",
            "What’s the difference between a good joke and a bad joke timing.",
            "I woke up this morning and forgot which side the sun rises from, then it dawned on me.",
            "I’ve just written a song about tortillas; actually, it’s more of a rap.",
            "The best thing about good old days is that we were neither good nor old.",
            "Do I lose when the police officer says papers and I say scissors?",
            "If I got 50 cents for every failed math exam, I’d have $ 6.30 now.",
            "A lot of people cry when they cut onions. The trick is not to form an emotional bond.",
            "I wrote a song about a tortilla. Well actually, it’s more of a wrap.",
            "Some people just have a way with words, and other people … oh … not have way. Steve Martin",
            "When I was a boy, I had a disease that required me to eat dirt three times a day in order to survive... It's a good thing my older brother told me about it.",
            "Moses had the first tablet that could connect to the cloud.",
            "About a month before he died, my uncle had his back covered in lard. After that, he went down hill fast.",
            "The first computer dates back to Adam and Eve. It was an Apple with limited memory, just one byte. And then everything crashed.",
            "If you 're still looking for that one person who will change your life take a look in the mirror.",
            "Alcohol is a perfect solvent: It dissolves marriages, families and careers.",
            "Anal intercourse is for assholes.",
            "Life without women would be a pain in the ass, literally.",
            "You won't drink away the alcoholism.",
            "What's the difference between men and pigs? Pigs don't turn into men when they drink.",
            "Crime in multi-storey car parks. That is wrong on so many different levels.",
            "I have downloaded this new app. Its great, it tells you what to wear, what to eat and if you’ve put on weight. Its called the Daily Mail.",
            "When I was younger I felt like a man trapped inside a woman’s body. Then I was born.",
            "I was playing chess with my friend and he said, ‘Let’s make this interesting’. So we stopped playing chess.",
            "I usually meet my girlfriend at 12:59 because I like that one-to-one time",
            "I really wanted kids when I was in my early 20s but I could just never… lure them into my car. No, I’m kidding… I don’t have a licence.",
            "I was very naive sexually. My first boyfriend asked me to do missionary and I buggered off to Africa for six months.",
            "One in four frogs is a leap frog.",
            "Love is like a fart. If you have to force it it’s probably shit.",
            "I used to be addicted to swimming but I’m very proud to say I’ve been dry for six years.",
            "My grandad has a chair in his shower which makes him feel old, so in order to feel young he sits on it backwards like a cool teacher giving an assembly about drugs.",
            "My girlfriend is absolutely beautiful. Body like a Greek statue – completely pale, no arms.",
            "I was raised as an only child, which really annoyed my sister.",
            "I bought myself some glasses. My observational comedy improved.",
            "You know you’re working class when your TV is bigger than your book case.",
            "Most of my life is spent avoiding conflict. I hardly ever visit Syria.",
            "Life is like a box of chocolates. It doesn’t last long if you’re fat.",
            "I was thinking of running a marathon, but I think it might be too difficult getting all the roads closed and providing enough water for everyone.",
            "You can’t lose a homing pigeon. If your homing pigeon doesn’t come back, then what you’ve lost is a pigeon.",
            "My Dad said, always leave them wanting more. Ironically, that’s how he lost his job in disaster relief.",
            "I really wish ISIS would stop playing violent video games and listening to Marilyn Manson.",
            "There’s only one thing I can’t do that white people can do, and that’s play pranks at international airports",
            "How do people make new mates? Asking for a friend.",
            "I wanted to do a show about feminism. But my husband wouldn’t let me.",
            "My Dad told me to invest my money in bonds. So I bought 100 copies of Goldfinger.",
            "I’ve decided to stop masturbating, since then I’ve not really felt myself.",
            "The first time I met my wife, I knew she was a keeper. She was wearing massive gloves.",
            "As a kid I was made to walk the plank. We couldn’t afford a dog.",
            "Money can’t buy you happiness? Well, check this out, I bought myself a Happy Meal.",
            "“My father was never sexist, he beat my brothers and I equally.",
            "The Scots invented hypnosis, chloroform and the hypodermic syringe. Wouldn’t it just be easier to talk to a woman?",
            "I saw a documentary on how ships are kept together. Riveting!",
            "Today… I did seven press ups: not in a row.",
            "I’m single. By choice. Her choice. No it was a mutual thing. We came to the mutual agreement that she would marry her ex boyfriend.",
            "Red sky at night: shepherd’s delight. Blue sky at night: day."




    };
    private static final Random randonGenrator=new Random();
    public static String getRandomJoke(){
        return JOKES[randonGenrator.nextInt(JOKES.length)];
    }
}


