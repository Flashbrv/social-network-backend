INSERT INTO sn_users (id, full_name, about_text) VALUES (1, 'Роман Б.', 'Життя прекрасне!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (2, 'Вікторія Б.', 'Все цікаво!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (3, 'Євген А.', 'Все просто!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (4, 'Валерій Ф.', 'Боже, чому все так складно???');
INSERT INTO sn_users (id, full_name, about_text) VALUES (5, 'Володимир Б.', 'Тут я ще не був)))');
INSERT INTO sn_users (id, full_name, about_text) VALUES (6, 'Сергій Б.', 'Допоможу всім!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (7, 'Олена Хз.', 'Я дуже гарна');
INSERT INTO sn_users (id, full_name, about_text) VALUES (8, 'Юлія К.', 'Треба ще одного \"малючка\"');
INSERT INTO sn_users (id, full_name, about_text) VALUES (9, 'Сергій К.', 'Ююююююююююллллллллллллллляяяяяяяяяяяяя!!!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (10, 'Таня К.', 'Йому подобається все те, що і мені');
INSERT INTO sn_users (id, full_name, about_text) VALUES (11, 'Нікіта Б.', 'Ну,  потом!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (12, 'Ніка К.', 'Де мої криси?');
INSERT INTO sn_users (id, full_name, about_text) VALUES (13, 'Діана Б.', 'Кусь!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (14, 'Олександр Б.', 'Вжжжжжжжжж!!!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (15, 'Борис Н.', 'Всіх переможемо!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (16, 'Марк У.', 'Я стріляти хочу!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (17, 'Марина Т.', 'Отримала права. Всі ховайтесь.');
INSERT INTO sn_users (id, full_name, about_text) VALUES (18, 'Олександр Т.', 'От блін, знову набулькався...');
INSERT INTO sn_users (id, full_name, about_text) VALUES (19, 'Юлія П.', 'Так... Щоб тобі ще вирвать?');
INSERT INTO sn_users (id, full_name, about_text) VALUES (20, 'Юрій К.', 'Краще всього воювати на кухні!');
INSERT INTO sn_users (id, full_name, about_text) VALUES (21, 'Артур А.', 'Складні розрахунки - не такі й складні!');

INSERT INTO sn_locations (id, city, country, user_id) VALUES (1, 'Полтава', 'Україна', 1);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (2, 'Полтава', 'Україна', 2);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (3, 'Ужгород', 'Україна', 3);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (4, 'Золотоноша', 'Україна', 4);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (5, 'Київ', 'Україна', 5);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (6, 'Черкаси', 'Україна', 6);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (7, 'Львів', 'Україна', 7);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (8, 'Карлівка', 'Україна', 8);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (9, 'Черкаси', 'Україна', 9);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (10, 'Карлівка', 'Україна', 10);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (11, 'Полтава', 'Україна', 11);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (12, 'Карлівка', 'Україна', 12);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (13, 'Черкаси', 'Україна', 13);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (14, 'Лохвиця', 'Україна', 14);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (15, 'Київ', 'Україна', 15);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (16, 'Торонто', 'Канада', 16);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (17, 'Полтава', 'Україна', 17);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (18, 'Полтава', 'Україна', 18);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (19, 'Полтава', 'Україна', 19);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (20, 'Гадяч', 'Україна', 20);
INSERT INTO sn_locations (id, city, country, user_id) VALUES (21, 'Київ', 'Україна', 21);

INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 2);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 4);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 5);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 6);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 8);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 9);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 11);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 14);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (1, 19);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 1);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 3);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 4);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 5);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 6);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 12);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 13);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 17);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 19);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (2, 20);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (3, 5);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (3, 13);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (3, 21);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (3, 12);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (4, 1);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (5, 10);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (6, 2);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (7, 13);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (8, 4);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (9, 15);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (11, 18);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (13, 7);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (13, 16);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (14, 3);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (15, 19);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (16, 5);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (17, 18);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (18, 21);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (19, 7);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (19, 12);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (20, 3);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (21, 1);
INSERT INTO sn_followers (user_id, followed_user_id) VALUES (21, 18);

INSERT INTO sn_posts (text, likes, user_id) VALUES ('Вчусь програмувати', 21, 1);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Вмвчаю Java та React', 5, 1);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Юриспрунденція - наше все!', 1, 2);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('2 + 2 = 5', 20, 3);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Volvo - краща машина!', 10, 4);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Кулемет - це сила!', 10, 5);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Будую все з нуля!', 10, 6);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Краса - є краса', 10, 7);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Пиво - найкращий напій!', 10, 8);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Ніхто нічого не може зробити сам!', 10, 9);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Їдемо за обоями', 10, 10);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Краща гра - Fortnight!!!', 10, 11);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Завела крис', 10, 12);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Вони такі хороші', 1, 12);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Купила нову кусачку', 10, 13);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Погризу всіх!', 10, 13);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Я стріляти хочу!', 10, 14);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Ніщо нізвідки не береться і нікуди не ззникає', 10, 15);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Вивчаю Іспанську!', 10, 16);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Не розумію нічогісінько!', 0, 16);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Я такий шалапут!!!', 10, 17);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Всім струнко!', 10, 18);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Вивчаю шунарінг', 10, 19);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Вчусь новим питкам та казням', 10, 19);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Війна війною, а обід за ропорядком!', 21, 20);
INSERT INTO sn_posts (text, likes, user_id) VALUES ('Немає нічого більш постійного, ніж щось тимчасове', 10, 21);

INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 1, 2);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Хай!', 2, 1);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Як справи?', 1, 2);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Норм', 2, 1);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Чим займаєшся?', 3, 4);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Відстань. Я працюю.', 4, 3);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Дай грошей.', 8, 9);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Вже нема.', 9, 8);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Давай побудуємо щось разом.', 5, 6);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Ніт!', 6, 5);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Чого?', 5, 6);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Бо треба відпочити.', 6, 5);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 7, 10);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 10, 7);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Як справи?', 7, 10);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Добре.', 10, 7);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('А ти як?', 10, 7);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Також все добре.', 7, 10);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('В що сьогодні будемо грати?', 11, 12);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('BravleStars.', 12, 11);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Ок', 11, 12);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 13, 14);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 14, 13);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Як справи?', 13, 14);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Добре.', 14, 13);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('А ти як?', 14, 13);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Норм', 13, 14);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 15, 16);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 16, 15);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Як справи?', 15, 16);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Добре.', 16, 15);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('А ти як?', 16, 15);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Норм', 15, 16);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Ти сьогодні довго?', 17, 18);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Ні', 18, 17);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Приїжджай скоріше. Я смачненького приготувала.', 17, 18);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Посстараюся.', 18, 17);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 19, 20);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт!', 20, 19);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Як справи?', 19, 20);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Добре.', 20, 19);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('А ти як?', 20, 19);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Норм', 19, 20);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт! Ти як сюди потрапив?', 1, 21);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Привіт! Лапками. Топ-топ!!!', 21, 1);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Що поробляєш?', 1, 21);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Вчуся.', 21, 1);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Це добре.', 1, 21);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('Що вчиш?', 1, 21);
INSERT INTO sn_messages (text, from_user_id, to_user_id) VALUES ('React і Redux', 21, 1);