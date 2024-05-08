CREATE TABLE IF NOT EXISTS tbl_post(
     id                 INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    title               VARCHAR(100) NOT NULL,
    author              VARCHAR(40) NOT NULL,
    date_created        DATE NOT NULL,
    date_updated        DATE NOT NULL,
    body                TEXT NOT NULL,
    image_path          VARCHAR(150)
);

-- Notes from the Underground
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Notes from the Underground by Fyodor Dostoevsky',
'John Paul Jayme',
'2024-02-14' ,
'2024-02-14' ,
'He is an anti-hero in the most cynical manner. Yet he lives in most of us.

 A twenty-five-year-old man''s admittance to internal debauchery. Embarrassing... to spell the words out. Yet the need to avoid confrontation of human emotions; of intense jealousy of unmet possibilities lived by other people. The alienation of how society wills me to become vis-a-vis existential plight to be who I need to be - cracks in the surface running deep into the Earth''s core. The repetitive self-description of "a wicked man" is as most vulnerable candor one can possess.

 There is a lot to unpack - the first part of "Underground" brim of philosophical ruminations. On the next part, Apropos of the Wet Snow, his preclude to what has happened before he went underground, a man full of avoidance, anguish, sadness, albeit an self-awareness that placates him at his feet.

 Time will tell when I fully resonate and be objective in the earnest manner. I will read this again sometime this year, after further enrichment of the mind.',
'book_notes.jpg');

-- Spring Start Here: Learn what you need and learn it well
--INSERT INTO tbl_post
--(title, author, date_created, date_updated, body, image_path)
--VALUES('Spring Start Here: Learn what you need and learn it well by Laurentiu Spilca',
--'John Paul Jayme',
--'2024-02-14' ,
--'2024-02-14' ,
--'The right point of reintroduction to the Spring ecosystem, given the gargantuan project it possess. As a refresher, these milestones have been covered :
-- 1. Spring Core, including Inversion of Control, Dependency Injection, and Bean Lifecycle.
-- 2. Spring AOP, the ever elusive yet understated hero of preemptive management of methods via advices and aspect.
-- 3. Spring Boot, the beacon amongst the fauna with its annotation over configuration approach to provide a more out-of-the box toolset for every developer. No more boilerplate code to ponder over hours on end!
-- 3. Spring Web, the must-know for every developer; from REST endpoints to managing HTTP server-client relationship.
-- 4. Spring Data, including Transactions, Data Sources, JDBC, and the simplification of the data persistence layer!
-- 5. Short and concise revisit on Junit Unit Testing and Spring Integration Tests! Mocking is mostly a complex syntactical jungle and I need to do more hands on tests.',
--'book_mansSearchForMeaning.jpg');

-- Man's search for meaning
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Man''s Search for Meaning by Viktor E. Frankl',
'John Paul Jayme',
'2024-02-18' ,
'2024-02-18' ,
'Self-transcendence. Tragic Optimism. How one should answer life''s challenge of meaning. My words are incapable of fully drawing out the humanity out of life''s enduring suffering. I don''t need to. My statement is the sum of my actions reflecting values. Loving other people and animals. Experiencing the beauty of nature, art, music, literature, and the love-making I do with the world. The struggle of the daily bread I will do with enthusiasm to a certain degree. I choose to stay with my family and pets and see through today that they are well and loved.

 The realities of my past are a testament of my legacy. The surviving from the ghetto into the reality on my own accord; forgiving the bullies of childhood; fostering love in a tense, love drought home; each chapter is my achievement and no one can take that away from me.',
'book_mansSearchForMeaning.jpg');

INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Virginia Woolf and Vita Sackville-West: Love Letters',
'John Paul Jayme',
'2024-02-21' ,
'2024-02-21' ,
'This is the first epistolary novel I have read. A 20-year correspondence, slow burn, tender, rapturous plights vascillating, of two brilliant writers Virginia and Vita - romance, manuscripts, and all the illicit emotions conceived.

  Virginia''s prose, albeit not having read her works yet, is beguiling like lark''s flight after a downpour. The sensitivity she allures the minds of most bountiful dressing. Juxtaposed is Vita''s often lengthy passages of her colorful social life, of her multiple publications to Hogarth Press, and the donkey that she is, of her myriad of lovers a point of jealousy to Woolf. An affair worth acquainted into. Opening the portal to the history and literature on the onslaught of World War 2.

  Let me perish and find the diary of my life interwoven with gripping passion, enduring grief, wearying acceptance, and the joy of continuing to live in spite of it all.',
'book_virginiaVitaLoveLetters.jpg');

--INSERT INTO tbl_post
--(title, author, date_created, date_updated, body, image_path)
--VALUES('Talking to Ourselves  by Andrés Neuman',
--'John Paul Jayme',
--'2024-03-21' ,
--'2024-03-21' ,
--'A raw glimpse of the conversations we tell ourselves in the time of illness - an extent of the brutal, searing, abandonment, confusion, and existential pain that maneuvers each person on the equation. The writing is digestable! Marinated with multitple references to literature dealing with disease, death, grief, and surviving them, and I will add them to my list as a person who suffers from chronic pain and grief.',
--'book_talkingToOurselves.jpg');

-- Hunger
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Pale Fire by Vladimir Nabokov',
'John Paul Jayme',
'2024-04-21' ,
'2024-04-21' ,
'My first Nabokov book, without knowing his idiosyncratic writing and mischievous protagonists, is a weird, whirlwind experience. It consists of a dramatic 999-line poem, written by John Shade, a distinguished poet at Wordsmith College, New Wye, and the obsession entailing his new neighbor and colleague Charles Kinbote, John’s alter-ego. Charles is always on the prowl for John’s whereabouts, his art, and an ardent desire for control, possession, and validation from Shade''s work, a manifestation of deeper psychological and possibly sexual impulses. A commentary is intertwined within the poem’s structure, basing on Kinbote’s own interpretations, both personal, a story of a Zemblan king, and the colorful passages of a revolution revolving the figure.

 I was unnerved by Sybil, John’s dear wife, on her indifference and secretive responses to Charles, but it is probably her intuition in guarding her marriage and the husband’s art. The narrator seemed to wash out the confines of the timeline, for I have even forgotten that he was a recent alien in the neighborhood.

 Around 70% of the story that my supposed stupefaction by the torrent of Zembla’s history did it finally click for me. From thereon, I purposefully detached myself from the frantic timelines, and the marathon became a walk in the park. The narrator merged with the Zambian king, then transporting into the neighbor in the person of Charles. Hallelujah! The layers of intrigue, with the narration becoming an unreliable web of woven delusion and truth. The nuances are lost to me now! How have I been mislead without a single whiff is beyond me. A lesson of conscientious reading and comprehension in lieu with the millions of literary and scholastic literature is an attitude the reader should possess. Do not trust every single word until a careful evaluation has been made.

 From today thereupon, I declare my love for Nabokov, his pen, and the playfulness his palms provoke, with myself and his readers, and the chance encounter to read such provocative works.',
'book_paleFire.jpg');

-- Sea of Tranquility
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Sea of Tranquility',
'John Paul Jayme',
'2024-01-23' ,
'2024-01-23' ,
'I first read this book at the start of 2023, when I found myself wanting to restart by reading habits beset by brain fog and devoid of focus. A winner of the yearly Goodreads Best Science Fiction of 2022, I was eager to devour the pages. Things began awry and I left it hanging in my Kindle.

 A year after the thought and a renewed mind besought to tie the loose ends of my reading list. Sea of Tranquility did not disappoint. Smooth as Ube Halaya spread in a Pan De Monay in a quiet Saturday afternoon. The curious case of time travel never ceases to amuse me. Interconnected threads of people across generations draws a cocoon of love and humanity that reality sometimes lack.

 Gaspery weaves in the histories of three people who have witnessed a glitch in the simulation, as they paint it. How intricate their personal stories be wrought in careful strokes of letters. Gaspery''s life of inaction seemingly thrown into a heist of investigating the anomaly and how a lack humanity in our professions instills harmony against the smokescreen to me. That the Time Institute will throw anyone once they deemed useless to the bureaucracy of a faceless mix of government and private eye should serve as a reminder to all of us.

 In the cacophony of morning rush, smoke-emitting vehicles, and incessant whirs of machines; when people have already moved too fast, too far, I wished to travel no further too. To be as still as a drop in a sea of stillness is what my life is about now. To create my own web of human connection, of animals; of a myriad of books and music to look forward to each day.' ,
'book_seaOfTranquility.jpg');

-- Anxious Perfectionist
--INSERT INTO tbl_post
--(title, author, date_created, date_updated, body, image_path)
--VALUES('The Anxious Perfectionist: How to Manage Perfectionism-Driven Anxiety Using Acceptance and Commitment Therapy',
--'John Paul Jayme',
--'2024-01-29' ,
--'2024-01-29' ,
--'' ,
--'book_anxiousPerfectionist.jpg');

-- Educated
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Educated',
'John Paul Jayme',
'2024-01-11' ,
'2024-01-11' ,
'Imagine a person removed from modern society. Inculcated by a Mormon survivalist family. Then a small wedge in the door. A sneak peek at a world of antediluvian gates, history-filled walls, and lectures about the great civilization. To Tara, these are unfamiliar spaces. She was homeschooled in congruent to her father’s belief that the government made schools as a mind-control ground. Instead, her world consisted of the beautiful Buck’s Peak - a bountiful land of peaks and valleys; of standing between  rebars to build structures; of finding gold in scrapyards; of the fear melding in her pores as her father’s fear of the rapture and her brother, Shawn, crushing his weight unto her fragile bones. An adolescence riddled with abuse and self-incrimination.

 A leap of faith forced her to self-study Mathematics and passed the GED into Brigham Young University. Rediscovering the world unbeknownst to her; first the horrors of the Holocaust, then the Civil Rights movement spearheaded by Martin Luther King Jr., her ignorance to the world finally became clear as day.  Her ignorance and lack of financial support were an impetus on further social isolation as she integrated into society. Coalescing between horror and wonder, challenging her beliefs, and even changing them, as she pursuits the endeavor of education. One part mind, the other an angelic voice, she is a force to be reckoned with.

 We could easily vilify the Westover family under the brainwashing of Mormonism. Weave in under familial love and the paths become more complicated. Yet, Tara understood the nuances of history. People become afflicted with various degrees of historical tangents. That her father suffered from Bipolar disorder, coupled with extreme religious trauma. Her love is unwavering throughout in spite of the antecedents. She has battled shame throughout her life. Hate coexisted within. It wasn’t that her parents were delusional. It is from the knowledge of a father who shoved her towards the chomping blades of the Shear, instead of pulling her away . Of knowing that  her Mother choosing to ignore her plaintiff cries and bruised lungs.

 As I pore through her memoir, a familiar sisterhood connected my own thread to hers. Of having a dysfunctional family enclosed in two separate religions lies a questioning boy. On a closer look, his earnest eyes were met with admonition and a searing belt. Do you hurt the people you love?

 An answered prayer came in the form of my education. Scholarships catapulted my mind into foreign environments and wider libraries my eyes can set on. The wider the net I casted, the heavier the load became. To my dismay, self-discovery is fraught with numerous uncomfortable situations. These feelings I am still challenging presently.  Callous hands and a pair of eager eyes, I continue to ambivalently breathe in this world. A kinship with a stranger in the face of Tara I wield hope of my mind setting me free.' ,
'book_educated.jpg');

-- Flowers for Algernon
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Flowers for Algernon',
'John Paul Jayme',
'2023-11-20' ,
'2023-11-20' ,
'Charlie is invariably the central voice in the story as his reports depict his trajectory in an experiment to cure mental retardation. He carries a lofty smile with an eagerness to please those in his proximity despite being the constant butt of the jokes. What sets him apart from his peers is his despite need to read and learn that stems from his childhood trauma of being unwanted by his mother and sister. Algernon, the mouse, shares the arduous journey of being a creation of the scientists, Dr. Nemur and Dr. Strauss, into a failed experiment. His romantic and sexual facets are explored with Alice Kinnian and Fay Lillman. He grapples with the emotional complexities that come with heightened intelligence. As Charlie''s intellect peaks, he discovers painful truths about his past and faces isolation.

The advent of Science and Technology to discover illnesses and make cure of them have been vital to the improved quality of life of humanity. However, mysteries are still being unraveled and the human mind comes to the forefront of the most complex structure of the universe. How one becomes who they are, thoughts firing at the speed of a millisecond, and how one missing gene can cause irreparable damage and eludes us to this day. The people in Charlie’s life invalidated the miracle of his surgery and instead lamented it as a curse. The unfairness of life’s imperfection does not fare well on the weighing scale. The absence of free will in this situation prevents anyone to experience life holistically.

The first time I read Flowers for Algernon was around college. I remember it as a life-changing piece of literature back then. Undeniably, the staggering emotional depth is consistent 5 years after. Picture this – an anxious mother, an alcoholic father, and an array of bullies throwing mischievous glances and throwing words. How can a child feel securely attached to the ground? He is in constant limbo of wanting to be loved and integrated to a community. The more I became smarter, the smaller the space I occupied in the classroom. The culmination is an uneven adult wanting to please everyone, low self-esteem, and an insatiable hunger to be whole. For people like Charlie, these things become part of their daily life since day one. The assurance of a family is an absolute need to fill the gaps. They require patience adjacent to their slow learning curve. If these supplementations are unmet, they might become a blackhole devoid of light and love. The cure is the genuine love and acceptance you will find in your intimate circle of friends, family, and nature.',
'book_flowersForAlgernon.jpg');

-- Frankenstein
INSERT INTO tbl_post
(title, author, date_created, date_updated, body, image_path)
VALUES('Frankenstein',
'John Paul Jayme',
'2023-12-30' ,
'2023-12-30' ,
'Society throughout the history has never been kind in the unaesthetic and unnatural beings. It precludes a base instinct to be afraid of unsightly surfaces, arthropods, and the unknown. This sadly reflects the present beauty norm . Now you have ultra-bleached skins, thinned-out noses and jaws, and the countless diet fads to fit the ideal weighing scale.

 It does warrant the question of authenticity and vulnerability in the face of constant brutal fixation of beauty. In a chilling discovery, we find a being born out of the unnaturalness who ideates living with the community.  This presents a philosophical and ethical dilemma! Alas, he does not find belongingness and instead is thrown rocks, like a monster without self-awareness, until love is forced out of his life and consumed by madness. This is juxtaposed with the beauty of Europe, starting with Geneva, Switzerland and the French and German countryside. I love how there is eeriness and suspense as the story progresses. A madman at your coattail in every move is serious business. Frankenstein’s isolation on the problem concerning his creation is also a relatable situation that most of us have been in. We are expected to be able to solve problems in a fast-paced environment on our own, unknowingly furthering the anxiety of an individual. Still, how Frankenstein dealt the situation is unnervingly a constant source of annoyance to me. He made me fall in love with the alps of Switzerland, the countryside of French and Germany, and yet it only fueled his inability to be accountable of his decisions in life. There is wisdom in consulting with nature. It heals even the most wounded soul. But escapism has its limits!

 On the other hand, I was fully moved by the creation’s plight to be loved and to be seen. His first interaction with humans and he is already prejudiced without given the privilege to make himself be understood by society. He is nurtured into becoming a monster! No one deserves to be deserted and unloved. Look at how people who grew up in uncaring homes turned out to become mentally unstable and emotionally lacking. It is pertinent for families to create a loving household to produce holistic adults.',
'book_frankenstein.jpg');