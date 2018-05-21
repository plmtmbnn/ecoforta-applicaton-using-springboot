-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2017 at 03:29 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecoforta`
--

-- --------------------------------------------------------

--
-- Table structure for table `berita`
--

CREATE TABLE `berita` (
  `id` int(11) NOT NULL,
  `judul` varchar(255) NOT NULL,
  `konten` text NOT NULL,
  `idAuthor` int(11) NOT NULL,
  `foto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `berita`
--

INSERT INTO `berita` (`id`, `judul`, `konten`, `idAuthor`, `foto`) VALUES
(1, 'Pemerintah Ingin Gula Dijual Rp 12.500/kg, Petani Bisa Rugi', 'Dalam kesepakatannya dengan sejumlah produsen dan distributor, Menteri Perdagangan (Mendag) Enggartiasto Lukita, menetapkan harga gula yang dijual di pasar paling mahal Rp 12.500/kg. Selanjutnya, Mendag juga akan menemui produsen gula tebu dalam negeri agar ikut menekan harga gula sesuai keinginan pemerintah.\r\n\r\nKetua Umum Asosiasi Petani Tebu Rakyat Indonesia (APTRI), Sumitro Samadikun, mengungkapkan rencana Mendag tersebut justru bakal mematikan industri lokal. Yang diuntungkan dengan adanya kebijakan ini adalah perusahaan swasta yang mendapat izin impor.\r\n\r\nSementara, pelaku usaha dalam negeri khususnya akan semakin sulit bersaing. Karena, saat ini harga lelang gula petani yang dilakukan oleh pabrik gula sendiri saat ini sudah sekitar Rp 12.500/kg. Sehingga sangat tidak mungkin bagi industri dalam negeri untuk memenuhi ketetapan harga seperti yang diinginkan pemerintah, Rp 12.500/kg di tingkat konsumen.\r\n\r\n"Sudah kita dapat rendemen rendah, sekarang diminta pemerintah harga gula Rp 12.500/kg. Tahun 2013 harga gula jatuh karena impor kita dibiarkan, lelang gula saja sekarang Rp 12.000/kg, bagaimana kita mau jual Rp 12.500, rumusnya dari mana," ucap Sumitro kepada detikFinance, Rabu (18/1/2017).\r\n\r\nDia mengasumsikan, dengan produksi tebu petani per hektar sebesar 100 ton, maka dengan tingkat rendemen rata-rata nasional saat 6, maka didapat gula sebesar 6 ton. Setelah dibagi dengan pabrik gula dengan rasio 64:36, maka gula yang diperoleh petani adalah 3,84 ton.\r\n\r\n"3,84 ton ini dikalikan dengan harga lelang sekarang Rp 12.000/kg, petani mendapatkan pendapatan dari gula Rp 48 juta. Nah sementara modal tanam tebu, biaya tembang dan angkut, pupuk sampai sewa tanah paling murah totalnya Rp 45 juta. Untungnya berapa itu, malah ada yang sampai biayanya Rp 50 juta," jelas Sumitro.\r\n\r\nMenurut dia, ketimbang pemerintah menekan harga gula yang berakibat petani tebu merugi, sebaiknya pemerintah merevitalisasi atau membangun pabrik gula baru milik BUMN, agar tingkat rendemen bisa naik.\r\n\r\nSebagai informasi, rendemen tebu sendiri adalah kadar kandungan gula di dalam batang tebu yang dinyatakan dengan persen. Bila dikatakan rendemen tebu 10%, artinya ialah bahwa dari 100 kg tebu yang digilingkan di Pabrik Gula akan diperoleh gula sebanyak 10 kg.\r\n\r\n"Tanam tebu itu susah. Waktunya juga setahun lebih, beda dengan tanam padi 3 bulan sudah panen. Lebih baik pemerintah bantu petani tingkatkan rendemen, itu pabrik-pabrik sudah tua tidak pernah diganti. Kalau rendemen tinggi, otomatis harga gula bisa otomatis murah," ujar Sumitro.\r\n\r\nSebelumnya, dalam pertemuannya dengan pabrikan dan distributor gula konsumsi, Mendag menginginkan harga gula bisa ditekan hingga Rp 12.500/kg. Pasalnya harga rata-rata gula saat ini Rp 14.000/kg dianggap terlalu membenani masyarakat.\r\n\r\n"Kesepakatan antara produsen pabrikan dengan distributor yang bertanggung jawab untuk distribusi sampai ke pasar, akan mengikuti harga acuan sebesar Rp 12.500/kg. Itu garis besarnya," kata Enggar.\r\n\r\nKesepakatan harga lewat intervensi ke distributor itu, sambungnya, sudah sesuai dengan Peraturan Presiden Nomor 71 Tahun 2015 tentang Penetapan dan Penyimpanan Barang Kebutuhan Pokok dan Barang Penting.\r\n\r\nData Kemendag, harga rata-rata gula pada Januari 2017 yakni sebesar Rp 14.087/kg atau turun 0,33% dibandingkan harga pada Desember 2016 sebesar Rp 14.133/kg. Harga rata-rata gula di beberapa daerah terendah yakni Yogjakarta Rp 12.933/kg, serta tertinggi di Tanjung Pinang, Tanjung Selor, dan Manokwari sebesar Rp 17.000/kg.', 1, '8b891fc7-47e5-47ac-8120-c3ddf87840f8_169.jpg'),
(2, 'Omzet Tipis, Banyak Petani Tebu Jual Lahan ke Pengembang Rumah', 'Jakarta - Luas lahan tebu di Indonesia semakin menyusut dari tahun ke tahun. Kondisi ini disebabkan pendapatan dari bertanam yang rendah, sehingga mendorong petani mengalihkan lahannya ke komoditas lain, beberapa di antaranya bahkan dijual petani dan dijadikan perumahan.\r\n\r\n"Lahan sekarang kan tercatat 450.000 hektar, yang pasti terus berkurang lahannya karena petani tebu banyak yang beralih ke tanaman lain, pendapatan tidak seberapa. Ada yang jadi real estate, tapi lebih banyak yang ganti ke tanaman lain," kata Ketua Umum Asosiasi Petani Tebu Rakyat Indonesia (APTRI), Sumitro Samadikun kepada detikFinance, Kamis (19/1/2017).\r\n\r\nMenurut dia, rendahnya pendapatan petani ini lantaran tingkat rendemen yang diberikan pabrik gula (PG) BUMN rendah, rata-rata PG yang kebanyakan peninggalan Belanda ini hanya memiliki rendemen antara 6% sampai 7%. Jauh di bawah rendemen pabrik gula swasta yang di atas 10%. \r\n\r\nSebagai informasi, rendemen tebu sendiri adalah kadar kandungan gula di dalam batang tebu yang dinyatakan dengan persen. Bila dikatakan rendemen tebu 10%, artinya ialah bahwa dari 100 kg tebu yang digilingkan di Pabrik Gula akan diperoleh gula sebanyak 10 kg.\r\n\r\nDia mengasumsikan, dengan produksi tebu petani per hektar maksimal sebesar 100 ton, maka dengan tingkat rendemen rata-rata nasional saat 6%, maka didapat gula sebesar 6 ton. Setelah dibagi dengan pabrik gula dengan rasio 64:36, maka gula yang diperoleh petani adalah 3,84 ton.\r\n\r\n"Sebanyak 3,84 ton ini dikalikan dengan harga lelang sekarang Rp 12.000/kg, petani mendapatkan pendapatan dari gula Rp 48 juta. Nah sementara modal tanam tebu, biaya tembang dan angkut, pupuk sampai sewa tanah paling murah totalnya Rp 45 juta. Untungnya berapa itu, malah ada yang sampai biayanya Rp 50 juta," jelas Sumitro.\r\n\r\nMenurut dia, ketimbang pemerintah menekan harga gula yang berakibat petani tebu merugi, sebaiknya pemerintah merevitalisasi atau membangun pabrik gula baru milik BUMN, agar tingkat rendemen bisa naik. \r\n\r\n"Tanam tebu itu susah. Waktunya juga setahun lebih, beda dengan tanam padi 3 bulan sudah panen. Lebih baik pemerintah bantu petani tingkatkan rendemen, itu pabrik-pabrik sudah tua tidak pernah diganti. Kalau rendemen tinggi, otomatis harga gula bisa otomatis murah," pungkas Sumitro. ', 1, 'ae34df87-cc52-4996-99c8-9578f7cd5a90_169.jpg'),
(3, 'Pupuk Indonesia Siapkan 1,5 Juta Ton Pupuk Bersubsidi', 'PT Pupuk Indonesia (Persero) telah menyiapkan pasokan pupuk bersubsidi sebesar total 1.491.556 ton yang siap pakai dan tersebar di seluruh wilayah Indonesia. Hal itu dilakukan untuk mendukung program pemerintah dalam menjaga ketahanan pangan nasional. \r\n\r\nDirektur Utama PT Pupuk Indonesia (Persero) Aas Asikin Idat mengatakan, hingga 16 Januari 2017 ini stok pupuk di lini I hingga IV untuk Urea sebesar 862.363 ton, stok NPK sebesar 299.852 Ton, stok SP-36 sebesar 122.554 Ton, ZA sebesar 124.443 Ton dan organik sebesar 82.344 Ton. Stok tersebut setara dengan stok untuk 1 bulan ke depan.\r\n\r\n"Tahun ini berdasarkan Permentan No.69/2016, pupuk bersubsidi tahun anggaran 2017 dialokasikan sebanyak 8,55 juta ton. Perinciannya, pupuk urea sebanyak 3,67 juta ton, pupuk SP-36 sebanyak 800.000 ton, pupuk ZA sebanyak 1 juta ton, pupuk NPK sebanyak 2,18 juta ton, dan pupuk organik sebanyak 895.288 ton," katanya dalam keterangan tertulis, Kamis (19/1/2016). \r\n\r\nSelain itu, Pupuk Indonesia menyiapkan stok pupuk melebihi ketentuan Kementan agar pendistribusiannya ke kios-kios resmi penjual pupuk bersubsidi dapat dilaksanakan dengan segera apabila sewaktu-waktu terjadi lonjakan permintaan oleh petani.\r\n\r\nUntuk pemasarannya, saat ini Pupuk Indonesia memiliki 1.110 Distributor dan 29.119 kios resmi di seluruh Indonesia. \r\n\r\n"Kios ini diharuskan untuk menyediakan semua pupuk bersubsidi seperti Urea, NPK, SP-36, ZA, dan organik, dan ciri kios resmi Pupuk Indonesia adalah memiliki papan nama kios resmi," jelas dia.\r\n\r\nGuna menjamin distribusi pupuk urea bersubsidi dan mencegah terjadinya penyimpangan penyaluran di lapangan pemerintah menerapkan sistem Distribusi Pupuk Bersubsidi secara tertutup dengan mempergunakan sistem distribusi dengan Rencana Definitif Kebutuhan Kelompok (RDKK).\r\n\r\nSehingga, untuk dapat memperoleh pupuk bersubsidi, petani harus tergabung dulu dengan kelompok tani dan menyusun RDKK. \r\n\r\n"Agar mendapatkan jatah pupuk bersubsidi dan menebus pupuk di kios resmi serta melaporkan apabila ada penyalahgunaan pupuk bersubsidi," jelasnya.', 1, 'e3b5d289-c991-45fa-8fa2-6f26c8e41443_169.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `forum`
--

CREATE TABLE `forum` (
  `id` int(11) NOT NULL,
  `topik_diskusi` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `konten` text NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `konten_forum`
--

CREATE TABLE `konten_forum` (
  `id` int(11) NOT NULL,
  `komentar` varchar(255) NOT NULL,
  `responden` varchar(255) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `orderlist`
--

CREATE TABLE `orderlist` (
  `id` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `id_pembeli` int(11) NOT NULL,
  `foto_produk` varchar(255) NOT NULL,
  `idToko` int(11) NOT NULL,
  `idProduk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `id` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `nama_toko` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL,
  `jenis_produk` varchar(255) NOT NULL,
  `tipe_pengiriman` varchar(255) NOT NULL,
  `deskripsi` text NOT NULL,
  `foto_produk` varchar(255) NOT NULL,
  `idToko` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`id`, `nama_produk`, `nama_toko`, `harga`, `jenis_produk`, `tipe_pengiriman`, `deskripsi`, `foto_produk`, `idToko`, `jumlah`) VALUES
(7, 'MPK Super', 'AndalanStore', 35000, 'Pupuk', 'tipe3', 'Pupuk super untuk membasmi hama tanaman.', '63576365_1-PUPUK-NPK-161616-INDUSTRI.jpg', 5, 0),
(8, 'Pupuk NPK Murah', 'TobaPupuk', 30000, 'Pupuk', 'tipe1', 'Pupuk asli, tanpa bahan kimia', 'pelangi.jpg', 6, 4),
(9, 'Bibit Cabai Unggul', 'AndalanStore', 25000, 'Bibit', 'tipe1', 'Bibit untuk cabai yang paling bagus', 'm_100_7173.jpg', 5, 3),
(10, 'Bibit Padi Sipandan', 'AndalanStore', 50000, 'Bibit', 'tipe1', 'Bibit untuk beras sipandan', 'CIMG5766.JPG', 5, 6),
(11, 'Bibit Jagung', 'AndalanStore', 20000, 'Bibit', 'tipe3', 'Bibit jagung yang bagus', 'jagungsuper.jpg', 5, 3),
(12, 'Sinar Pupuk', 'TobaPupuk', 20000, 'Pupuk', 'tipe2', 'Sangat baik untuk tanaman', '63576365_1-PUPUK-NPK-161616-INDUSTRI.jpg', 6, 5),
(13, 'Bibit Tangaladu', 'Lestari', 70000, 'Bibit', 'tipe2', 'Ini bibitnya bagus untuk pertumbuhan kimcil', '63576365_1-PUPUK-NPK-161616-INDUSTRI.jpg', 9, 2);

-- --------------------------------------------------------

--
-- Table structure for table `produkterjual`
--

CREATE TABLE `produkterjual` (
  `id` int(11) NOT NULL,
  `idBuyer` int(11) NOT NULL,
  `idSeller` int(11) NOT NULL,
  `idProduk` int(11) NOT NULL,
  `namaProduk` varchar(255) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `namaPenerima` varchar(255) NOT NULL,
  `lokasi` varchar(255) NOT NULL,
  `rekeningBank` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produkterjual`
--

INSERT INTO `produkterjual` (`id`, `idBuyer`, `idSeller`, `idProduk`, `namaProduk`, `jumlah`, `harga`, `status`, `keterangan`, `alamat`, `namaPenerima`, `lokasi`, `rekeningBank`) VALUES
(23, 4, 2, 7, 'MPK Super', 1, 35000, 'D', ' awfa', 'awfwaf', 'qwfqwfqw', 'Balige', 'qwfqwfqw');

-- --------------------------------------------------------

--
-- Table structure for table `tanaman`
--

CREATE TABLE `tanaman` (
  `id` int(11) NOT NULL,
  `nama_tanaman` varchar(255) NOT NULL,
  `deskripsi` text NOT NULL,
  `gambar` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `toko`
--

CREATE TABLE `toko` (
  `id` int(11) NOT NULL,
  `nama_toko` varchar(100) NOT NULL,
  `domain_toko` varchar(30) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `kontak` varchar(255) NOT NULL,
  `foto` varchar(255) NOT NULL,
  `idSeller` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `toko`
--

INSERT INTO `toko` (`id`, `nama_toko`, `domain_toko`, `alamat`, `kontak`, `foto`, `idSeller`) VALUES
(5, 'AndalanStore', 'AndalanStore', 'Bandung', 'wwww', 'Sports-Fitness-Logo-1.png', 2),
(6, 'TobaPupuk', 'TobaPupuk', 'Balige', 'qwfqwfqw', 'Sports-Fitness-Logo-1.png', 2),
(7, 'MarHauma', 'MarHauma', 'Jl. Perkasa, No 21', '3232', '13178917_10201874092572025_7933855864776827117_n.jpg', 4),
(8, 'wdwaf', 'qwfqwfqw', 'qfqwfqw', '21333', 'S__4464849.jpg', 4),
(9, 'Lestari', 'Lestari', 'Tarutung', '0212121', 'BoldMedia-flat-logo.png', 2);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `role` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(155) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `lokasi` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `avatar` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `role`, `nama`, `jenis_kelamin`, `tanggal_lahir`, `lokasi`, `alamat`, `username`, `password`, `avatar`, `email`) VALUES
(1, 'admin', 'admin', '-', '2017-01-17', 'admin', 'admin', 'admin', 'admin', '', ''),
(2, 'user', 'Polma Tambunan', 'Laki-laki', '1996-04-24', 'Balige', 'JL. Lumban Gaol', 'polmatambunan', 'polmatambunan', 'dsc_1214.jpg', 'polma@gmail.com'),
(3, 'user', 'Marta', 'Female', '2012-12-12', 'Balige', 'qwfqw', 'iss14026', 'polmatambunan', '10620622_10201868660036215_7403854794622157734_n.jpg', 'marta@gmail.com'),
(4, 'user', 'Martha Gultom', 'Female', '2012-12-12', 'Baliges', 'Jl. Perkasa, No 21,1', 'martha', '12345', '13173952_10201868659676206_7763205705909203823_n.jpg', 'marta@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `berita`
--
ALTER TABLE `berita`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `forum`
--
ALTER TABLE `forum`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `konten_forum`
--
ALTER TABLE `konten_forum`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orderlist`
--
ALTER TABLE `orderlist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produkterjual`
--
ALTER TABLE `produkterjual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tanaman`
--
ALTER TABLE `tanaman`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `toko`
--
ALTER TABLE `toko`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `domainToko` (`domain_toko`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `berita`
--
ALTER TABLE `berita`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `forum`
--
ALTER TABLE `forum`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `konten_forum`
--
ALTER TABLE `konten_forum`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `orderlist`
--
ALTER TABLE `orderlist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `produk`
--
ALTER TABLE `produk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `produkterjual`
--
ALTER TABLE `produkterjual`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `tanaman`
--
ALTER TABLE `tanaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `toko`
--
ALTER TABLE `toko`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
