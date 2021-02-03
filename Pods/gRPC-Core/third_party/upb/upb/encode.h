/*
** upb_encode: parsing into a upb_msg using a upb_msglayout.
*/

#ifndef UPB_ENCODE_H_
#define UPB_ENCODE_H_

#if COCOAPODS==1
  #include  "third_party/upb/upb/msg.h"
#else
  #include  "upb/msg.h"
#endif

/* Must be last. */
#if COCOAPODS==1
  #include  "third_party/upb/upb/port_def.inc"
#else
  #include  "upb/port_def.inc"
#endif

#ifdef __cplusplus
extern "C" {
#endif

enum {
  /* If set, the results of serializing will be deterministic across all
   * instances of this binary. There are no guarantees across different
   * binary builds.
   *
   * If your proto contains maps, the encoder will need to malloc()/free()
   * memory during encode. */
  UPB_ENCODE_DETERMINISTIC = 1,

  /* When set, unknown fields are not printed. */
  UPB_ENCODE_SKIPUNKNOWN = 2,
};

#define UPB_ENCODE_MAXDEPTH(depth) ((depth) << 16)

char *upb_encode_ex(const void *msg, const upb_msglayout *l, int options,
                    upb_arena *arena, size_t *size);

UPB_INLINE char *upb_encode(const void *msg, const upb_msglayout *l,
                            upb_arena *arena, size_t *size) {
  return upb_encode_ex(msg, l, 0, arena, size);
}

#if COCOAPODS==1
  #include  "third_party/upb/upb/port_undef.inc"
#else
  #include  "upb/port_undef.inc"
#endif

#ifdef __cplusplus
}  /* extern "C" */
#endif

#endif  /* UPB_ENCODE_H_ */
