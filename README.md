# Picasso
### Demo load hình dùng thư viện Picasso

Chèn hình từ Internet vào ImageView dùng thư viện Picasso. Xem thêm hướng dẫn từ site chính thức:
https://square.github.io/picasso/
https://github.com/square/picasso

1/ Cấu hình
Mở build.grade của Module:app để thêm các thư viện ở mục dependencies dòng sau:

implementation 'com.squareup.picasso:picasso:2.71828'

Sau đó, hãy Sync Project.

2/ Thao tác đổ vào ImageView imgHinh:

Picasso.get()
.load("http://hcmup.edu.vn/images/stories/site_18/mainsite/daotao.png") .error(R.drawable.noimage)
.fit()
.into(imgHinh);
