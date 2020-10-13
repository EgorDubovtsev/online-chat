CREATE TABLE IF NOT EXISTS user_personal_data(
login varchar(150) primary key,
	age integer not null,
	personal_name varchar(255) not null
)

CREATE TABLE IF NOT EXISTS user_login_data(
login varchar(150) primary key references user_personal_data(login),
	personal_password varchar(255) not null
)

CREATE TABLE IF NOT EXISTS chats_id(
	chat_id SERIAL primary key,
first_user varchar(255) references user_personal_data(login),
	second_user varchar(255) references user_personal_data(login)
)

CREATE TABLE IF NOT EXISTS messages(
	message_id SERIAL primary key,
	chat_id integer references chats_id(chat_id),
	from_user varchar(255) references user_personal_data(login),
	message_text varchar(255) references user_personal_data(login),
	send_time timestamp

)