# 🎬 Movie & Director API

Bu proje, **Spring Boot** kullanılarak geliştirilmiş bir RESTful API uygulamasıdır.
Amaç, film ve yönetmen verilerini yönetebilen, katmanlı mimariye sahip bir backend sistemi oluşturmaktır.

---

## 🚀 Proje Amacı

Bu proje ile:

* RESTful API geliştirme pratiği kazanmak
* Katmanlı mimariyi (Controller - Service - Repository) uygulamak
* DTO yapısı ile veri transferini yönetmek
* Spring Boot ekosistemine hakimiyet kazanmak

hedeflenmiştir.

---

## 🛠️ Kullanılan Teknolojiler

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* Lombok

---

## 🧩 Mimari Yapı

Proje, katmanlı mimari prensiplerine uygun olarak geliştirilmiştir:

* **Controller** → HTTP isteklerini karşılar
* **Service (Business)** → İş mantığını içerir
* **Repository** → Veritabanı işlemlerini yönetir
* **Entity** → Veritabanı modelleri
* **DTO (Request / Response)** → Veri transfer katmanı

---

## 📂 Özellikler

### 🎥 Movie

* Film ekleme
* Film güncelleme
* Film silme
* Tüm filmleri listeleme
* ID ile film getirme

### 🎬 Director

* Yönetmen ekleme
* Yönetmen güncelleme
* Yönetmen silme
* Tüm yönetmenleri listeleme
* ID ile yönetmen getirme

---

## 🔄 API Örnek Endpoint’ler

### Movie

* `GET /movies` → Tüm filmleri getir
* `GET /movies/{id}` → ID’ye göre film getir
* `POST /movies` → Yeni film ekle
* `PUT /movies/{id}` → Film güncelle
* `DELETE /movies/{id}` → Film sil

### Director

* `GET /directors`
* `POST /directors`
* `PUT /directors/{id}`
* `DELETE /directors/{id}`

---

## ▶️ Projeyi Çalıştırma

```bash
mvn clean install
mvn spring-boot:run
```

Uygulama varsayılan olarak:

```id="port"
http://localhost:8080/swagger-ui/index.html
```

---

## 📌 Geliştirme Notları

* DTO yapısı kullanılarak entity ile dış dünya ayrıştırılmıştır
* Katmanlar arası bağımlılıklar minimize edilmiştir
* Temiz ve okunabilir kod yazımı hedeflenmiştir

---

## 📈 Geliştirilebilir Alanlar

* Validation (Bean Validation) eklenebilir
* Global Exception Handling geliştirilebilir
* Swagger/OpenAPI dokümantasyonu eklenebilir
* Authentication & Authorization (JWT) entegre edilebilir

---

## 📬 İletişim

Geri bildirimlere ve önerilere açığım.

---

⭐ Bu projeyi faydalı bulursanız repo’ya star vermeyi unutmayın!
