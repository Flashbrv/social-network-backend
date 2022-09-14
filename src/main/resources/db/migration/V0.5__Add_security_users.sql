SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;

ALTER TABLE sn_users MODIFY about_text VARCHAR(255) NULL;

ALTER TABLE sn_users
ADD email VARCHAR(255) NOT NULL AFTER full_name,
ADD password VARCHAR(300) NOT NULL AFTER email,
ADD status VARCHAR(100) NOT NULL DEFAULT 'ACTIVE' AFTER password,
ADD role VARCHAR(100) NOT NULL DEFAULT 'USER' AFTER status;

/*6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b*/
UPDATE sn_users SET
password='$2a$12$e.SCI/aTO5CeOHnAire24uCuGBcHgpBKZmDLFzapdC4frgFu1TVXa';

UPDATE sn_users SET email='roman.belnitskiy@example.mail.com', role='ADMIN' where id=1;
UPDATE sn_users SET email='viktoriab.test235@example.mail.com' where id=2;
UPDATE sn_users SET email='evgena.test235@example.mail.com' where id=3;
UPDATE sn_users SET email='valerijf.test235@example.mail.com' where id=4;
UPDATE sn_users SET email='volodimirb.test235@example.mail.com' where id=5;
UPDATE sn_users SET email='sergijb.test235@example.mail.com' where id=6;
UPDATE sn_users SET email='olenahz.test235@example.mail.com' where id=7;
UPDATE sn_users SET email='juliak.test235@example.mail.com' where id=8;
UPDATE sn_users SET email='sergijk.test235@example.mail.com' where id=9;
UPDATE sn_users SET email='taniak.test235@example.mail.com' where id=10;
UPDATE sn_users SET email='nikitab.test235@example.mail.com' where id=11;
UPDATE sn_users SET email='nikak.test235@example.mail.com' where id=12;
UPDATE sn_users SET email='dianab.test235@example.mail.com' where id=13;
UPDATE sn_users SET email='sashab.test235@example.mail.com' where id=14;
UPDATE sn_users SET email='borisn.test235@example.mail.com' where id=15;
UPDATE sn_users SET email='marku.test235@example.mail.com' where id=16;
UPDATE sn_users SET email='marinat.test235@example.mail.com' where id=17;
UPDATE sn_users SET email='sashat.test235@example.mail.com' where id=18;
UPDATE sn_users SET email='juliap.test235@example.mail.com' where id=19;
UPDATE sn_users SET email='jurijk.test235@example.mail.com' where id=20;
UPDATE sn_users SET email='artura.test235@example.mail.com' where id=21;

COMMIT;
