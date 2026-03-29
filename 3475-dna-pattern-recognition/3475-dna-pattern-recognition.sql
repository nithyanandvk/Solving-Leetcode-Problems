# Write your MySQL query statement below
select *, 
dna_sequence like "ATG%" as has_start,
dna_sequence LIKE '%TAA' 
OR dna_sequence LIKE '%TAG' 
OR dna_sequence LIKE '%TGA' AS has_stop,
dna_sequence like "%ATAT%" as has_atat,
dna_sequence like "%GGG%" as has_ggg
from Samples;