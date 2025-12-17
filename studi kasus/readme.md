# Penjelasan Singkat untuk Interview

## 1. VARIABEL GLOBAL
```java
static String[][] dataMhs = new String[100][5];  // Array 2D
static int jumlahData = 0;  // Counter
static Scanner sc = new Scanner(System.in);
```
**Jawab:** Array 2D untuk 100 mahasiswa × 5 atribut (Nama, NIM, IPK, Jenis, Gaji)

---

## 2. ALUR PROGRAM
```
Main → Menu (do-while) → Switch-case → Panggil fungsi → Loop
```

---

## 3. VALIDASI INPUT (Pattern)
```java
boolean valid = false;
while(!valid) {
    // input
    if(kondisi_ok) valid = true;
    else System.out.println("Error");
}
```
**Dipakai untuk:** IPK (0-4), Jenis Beasiswa, Penghasilan (≤2jt)

---

## 4. NESTED LOOP #1 - TAMPIL DATA
```java
for(int i = 0; i < jumlahData; i++) {      // Loop mahasiswa
    for(int j = 0; j < 5; j++) {            // Loop atribut
        System.out.printf(..., dataMhs[i][j]);
    }
    System.out.println();  // Baris baru
}
```
**Jawab:** Outer = tiap mahasiswa, Inner = tiap atribut

---

## 5. NESTED LOOP #2 - CARI DATA
```java
for(int i = 0; i < jumlahData; i++) {
    if(dataMhs[i][3].equals(cari)) {  // Filter jenis
        for(int j = 0; j < 5; j++) {
            // Print data yang cocok
        }
    }
}
```
**Jawab:** Ada IF untuk filter sebelum inner loop


## 6. NESTED LOOP #3 - HITUNG RATA-RATA
```java
for(int i = 0; i < 3; i++) {              // 3 jenis beasiswa
    for(int j = 0; j < jumlahData; j++) {  // Scan semua mahasiswa
        if(dataMhs[j][3].equals(jenisBeasiswa[i])) {
            total += Double.parseDouble(dataMhs[j][2]);
        }
    }
    // Hitung & print rata-rata
}
```
**Jawab:** Outer = per jenis, Inner = scan semua data


## 7. SYNTAX PENTING

| Syntax | Fungsi |
|--------|--------|
| `sc.nextLine()` | Bersihkan buffer |
| `.toUpperCase()` | Konversi huruf besar |
| `.equals()` | Bandingkan String |
| `String.valueOf()` | Angka → String |
| `Double.parseDouble()` | String → double |
| `dataMhs[i][j]` | Akses array 2D |

---