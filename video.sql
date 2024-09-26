SELECT * FROM video;

INSERT INTO video(video_url, video_img, video_title, video_desc, channel_code)
VALUES('http://192.168.10.51:8082/video/AKMU1.mp4',
	'http://192.168.10.51:8082/thumbnail/akmu.webp',
    'AKMU - 후라이의 꿈 LIVE CLIP (FESTIVAL ver.)',
    'More about AKMU',
    1);
INSERT INTO video(video_url, video_img, video_title, video_desc, channel_code)
VALUES('http://192.168.10.51:8082/video/day6.mp4',
	'http://192.168.10.51:8082/thumbnail/day6.webp',
    'DAY6(데이식스)의 킬링보이스를 라이브로!',
    '데이식스의 쇼에 오신 걸 환영합니다!',
    2);
