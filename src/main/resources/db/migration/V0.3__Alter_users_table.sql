ALTER TABLE sn_users
ADD looking_for_job BIT(1) DEFAULT 0 AFTER about_text,
ADD looking_for_job_desc VARCHAR(255) AFTER looking_for_job,
ADD github VARCHAR(2048) AFTER looking_for_job_desc,
ADD facebook VARCHAR(2048) AFTER github,
ADD instagram VARCHAR(2048) AFTER facebook,
ADD twitter VARCHAR(2048) AFTER instagram,
ADD website VARCHAR(2048) AFTER twitter,
ADD youtube VARCHAR(2048) AFTER website,
ADD linkedin VARCHAR(2048) AFTER youtube,
ADD photo_small VARCHAR(2048) AFTER linkedin,
ADD photo_large VARCHAR(2048) AFTER photo_small;